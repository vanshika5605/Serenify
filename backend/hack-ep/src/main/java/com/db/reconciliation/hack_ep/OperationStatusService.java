package com.db.reconciliation.hack_ep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperationStatusService {
	
	@Autowired
	private ClientNotificationAdapter clientNotificationAdapter;

	public void handleClientNotification(ClientNotification clientNotification) {
		clientNotificationAdapter.notifyClient(clientNotification);
	}
}
