package org.project.booknetworkapi.feedback;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FeedbackResponse {

    private double note;
    private String comment;
    private boolean ownFeedback;

}