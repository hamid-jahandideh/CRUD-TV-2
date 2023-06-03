package model.entity;

public class TV {
    private Long id;
    private String tvMark;
    private String tvModel;
    private Long tvWidth;
    private long tvHeight;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTvMark() {
        return tvMark;
    }

    public void setTvMark(String tvMark) {
        this.tvMark = tvMark;
    }

    public String getTvModel() {
        return tvModel;
    }

    public void setTvModel(String tvModel) {
        this.tvModel = tvModel;
    }

    public Long getTvWidth() {
        return tvWidth;
    }

    public void setTvWidth(Long tvWidth) {
        this.tvWidth = tvWidth;
    }

    public long getTvHeight() {
        return tvHeight;
    }

    public void setTvHeight(long tvHeight) {
        this.tvHeight = tvHeight;
    }
}
