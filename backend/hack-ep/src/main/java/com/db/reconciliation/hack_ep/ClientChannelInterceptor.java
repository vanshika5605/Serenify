package com.db.reconciliation.hack_ep;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.stomp.StompCommand;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.messaging.support.ChannelInterceptor;
import org.springframework.messaging.support.MessageHeaderAccessor;

import java.util.ArrayList;
import java.util.Map;

public class ClientChannelInterceptor implements ChannelInterceptor {
    @Override
    public Message<?> preSend(Message<?> message, MessageChannel channel) {
    	 StompHeaderAccessor accessor = MessageHeaderAccessor.getAccessor(message, StompHeaderAccessor.class);

         if (accessor!=null && StompCommand.CONNECT.equals(accessor.getCommand())) {
             Object nativeHeaders = message.getHeaders().get(SimpMessageHeaderAccessor.NATIVE_HEADERS);
             if (nativeHeaders instanceof Map) {
                 Object requestId = ((Map) nativeHeaders).get("requestId");
                 if (requestId instanceof ArrayList) {
                	 String username = ((ArrayList) requestId).get(0).toString();
                     accessor.setUser(new User(username));
                 } else {
                	 throw new IllegalArgumentException("Invalid/missing mandatory parameter 'requestId'");
                 }
             } else {
            	 throw new IllegalArgumentException("Missing native headers from connect request");
             }
         }
         return message;
    }
}