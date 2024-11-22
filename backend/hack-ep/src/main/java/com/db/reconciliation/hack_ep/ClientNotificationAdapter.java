package com.db.reconciliation.hack_ep;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Service;

@Service
public class ClientNotificationAdapter {

	@Value("/queue/statuses")
	private String websocketUserStatusUri;
	
	@Autowired
    public SimpMessageSendingOperations messagingTemplate;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ClientNotificationAdapter.class);

	public void notifyClient(ClientNotification clientNotification) {
		LOGGER.info("Sending notification for requestId {} as {} to user", clientNotification.getRequestId(), clientNotification);
		messagingTemplate.convertAndSendToUser(clientNotification.getRequestId(), websocketUserStatusUri, clientNotification);
	}
}
