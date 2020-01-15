package ropandi.joinhikeservice.service;

import ropandi.joinhikeservice.model.MailModel;

public interface IEmailService {

	void sendingActivationLink(MailModel mail);
}
