package me.jaeyeon.study.events;

import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data @Builder @AllArgsConstructor @NoArgsConstructor
public class EventDto {

    @NotEmpty
    private String name;                           // 이벤트 이름

    @NotEmpty
    private String description;                    // 설명

    @NotNull
    private LocalDateTime beginEnrollmentDateTime; // 등록 시작일시

    @NotNull
    private LocalDateTime closeEnrollmentDateTime; // 종료일시

    @NotNull
    private LocalDateTime beginEventDateTime;      // 이벤트 시작일시

    @NotNull
    private LocalDateTime endEventDateTime;        // 이벤트 종료일시
    private String location;                       // (optional) 이게 없으면 온라인 모임

    @Min(0)
    private int basePrice;                         // (optional) 기본 금액

    @Min(0)
    private int maxPrice;                          // (optional) 최고 금액

    @Min(0)
    private int limitOfEnrollment;                 // 등록한도
}
