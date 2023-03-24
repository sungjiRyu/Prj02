package com.readers.be3.vo.mypage;

import com.readers.be3.entity.MyPageView;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ResponseUserInfoVO {
    // private List<MyPageView> list;

    @Schema(description = "유저 랭크" , example = "58")
    private Long userRank;
    @Schema(description = "유저 닉네임" , example = "user#1676433143129")
    private String nickName;
    @Schema(description = "유저 포인트" , example = "3000")
    private Integer userPoint;
    @Schema(description = "유저 완독서" , example = "5")
    private Integer userBook;
    @Schema(description = "유저 완독서 페이지 수" , example = "3000")
    private Integer userPage;
    @Schema(description = "유저 독후감 수" , example = "2")
    private Integer userArticle;
    @Schema(description = "유저 한줄평 수" , example = "4")
    private Integer userOneComment;
    @Schema(description = "유저 일정계획 일수" , example = "15")
    private Long userDays;
    @Schema(description = "유저 프로필 사진" , example = "레서판다")
    private String userImg;

    public ResponseUserInfoVO (MyPageView myPageView) {
        this.userRank = myPageView.getRankSeq();
        this.nickName = myPageView.getUiNickName();
        this.userPoint = myPageView.getUiPoint();
        this.userBook = myPageView.getUiTotalBook();
        this.userPage = myPageView.getUiTotalPage();
        this.userImg = myPageView.getUimgUri();
    }
}
