package kt.m4.model;

import javax.persistence.*;

@Entity
public class ThanhPho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String tenTP;
    @ManyToOne
    private QuocGia quocGia;
    private int dienTich;
    private int danSo;
    private int GDP;
    private String moTaTP;

    public ThanhPho() {
    }

    public ThanhPho(long id, String tenTP, QuocGia quocGia, int dienTich, int danSo, int GDP, String moTaTP) {
        this.id = id;
        this.tenTP = tenTP;
        this.quocGia = quocGia;
        this.dienTich = dienTich;
        this.danSo = danSo;
        this.GDP = GDP;
        this.moTaTP = moTaTP;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTenTP() {
        return tenTP;
    }

    public void setTenTP(String tenTP) {
        this.tenTP = tenTP;
    }

    public QuocGia getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(QuocGia quocGia) {
        this.quocGia = quocGia;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public int getDanSo() {
        return danSo;
    }

    public void setDanSo(int danSo) {
        this.danSo = danSo;
    }

    public int getGDP() {
        return GDP;
    }

    public void setGDP(int GDP) {
        this.GDP = GDP;
    }

    public String getMoTaTP() {
        return moTaTP;
    }

    public void setMoTaTP(String moTaTP) {
        this.moTaTP = moTaTP;
    }
}
