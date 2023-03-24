package com.readers.be3.vo.article;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// 게시글 작성할때 받을 데이터( 제목과 내용 )
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostArticleVO {
    @Schema(description = "게시글 제목", example = "testTitle01", required = true)
    private String aiTitle;
    @Schema(description = "게시글 내용", example = "testContent01", required = true)
    private String content;
    @Schema(description = "공개여부(1. 공개, 2. 비공개)", example = "1", required = true)
    private Integer aiPublic;
    @Schema(description = "현재 로그인한 유저 번호", example = "1", required = true)
    private Long uiSeq;
    @Schema(description = "책 번호", example = "1", required = true)
    private Long biSeq;
    @Schema(description = "첨부파일(이미지만 가능)", required = false)
    private List<MultipartFile> files;
}