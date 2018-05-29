package com.drestaurant.customer.domain.api;

import java.util.UUID;

import org.axonframework.commandhandling.TargetAggregateIdentifier;

import com.drestaurant.common.domain.command.AuditableAbstractCommand;
import com.drestaurant.common.domain.model.AuditEntry;

/**
 * @author: idugalic
 * Date: 5/20/18
 * Time: 17:17 PM
 */
public class MarkCustomerOrderAsDeliveredCommand extends AuditableAbstractCommand{

	@TargetAggregateIdentifier
	private String targetAggregateIdentifier;

	public MarkCustomerOrderAsDeliveredCommand(String targetAggregateIdentifier, AuditEntry auditEntry) {
		super(auditEntry);
		this.targetAggregateIdentifier = targetAggregateIdentifier;
	}

	public MarkCustomerOrderAsDeliveredCommand(AuditEntry auditEntry) {
		this(UUID.randomUUID().toString(), auditEntry);
	}

	public String getTargetAggregateIdentifier() {
		return targetAggregateIdentifier;
	}

}
