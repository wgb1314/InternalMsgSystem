package com.msg.service;

import org.springframework.validation.annotation.Validated;

import com.msg.domain.Message;

@Validated
public interface MessageService extends BaseService<Message>{

}
