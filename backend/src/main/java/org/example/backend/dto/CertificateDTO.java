package org.example.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class CertificateDTO {
    private String studentName;
    private String course;
    private long dateIssued;
}
