package com.app.floc.domain.dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@RequiredArgsConstructor
public class NoticeDTO {
    private Long id;
    private Long adminId;
    private String noticeTitle;
    private String noticeContent;
    private String noticeCreatedDate;
    private String noticeUpdatedDate;
    private Long noticeViewedCount;
    private String noticeImageName;
    private String noticeImageUuid;
    private Long noticeImageSize;
}



