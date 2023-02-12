package com.paymen.core.message.producer.vo.payload.payment;

import com.paymen.core.message.producer.vo.payload.amount.Amount;
import com.paymen.core.message.producer.vo.payload.creditor.Creditor;
import com.paymen.core.message.producer.vo.payload.creditor.CreditorAccount;
import com.paymen.core.message.producer.vo.payload.creditor.CreditorAgent;
import com.paymen.core.message.producer.vo.payload.creditor.UltimateCreditor;
import com.paymen.core.message.producer.vo.payload.debtor.Debtor;
import com.paymen.core.message.producer.vo.payload.debtor.DebtorAccount;
import com.paymen.core.message.producer.vo.payload.debtor.DebtorAgent;
import com.paymen.core.message.producer.vo.payload.debtor.UltimateDebitor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class OrgnlTxRef {
	 Amount amount;
	 Creditor creditor;
	 CreditorAccount creditorAccount;
	 CreditorAgent creditorAgent;
	 Debtor debtor;
	 DebtorAccount debtorAccount;
	 DebtorAgent DbtrAgtObject;
	 private String PmtMtd;
	 PmtTpInf PmtTpInfObject;
	 private String ReqdExctnDt;
	 RemitanceInfo remitanceInfo;
	 UltimateCreditor ultimateCreditor;
	 UltimateDebitor ultimateDebitor;

	}
