package com.rsd.childcare.dto.dailydetail;


public class DialogueDetailDTO extends DailyDetailDTO{

	private String dialogue;
	private String dialogueInitiator;

	public String getDialogue() {
		return dialogue;
	}

	public void setDialogue(String dialogue) {
		this.dialogue = dialogue;
	}

	public String getDialogueInitiator() {
		return dialogueInitiator;
	}

	public void setDialogueInitiator(String dialogueInitiator) {
		this.dialogueInitiator = dialogueInitiator;
	}	
}
