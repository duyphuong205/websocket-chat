package com.chat.model;

import com.chat.enums.MsgType;
import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChatMessage {
    private MsgType type;
    private String content;
    private String sender;
}
