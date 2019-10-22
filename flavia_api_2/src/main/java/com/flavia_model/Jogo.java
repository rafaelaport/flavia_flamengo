package com.flavia_model;


public class Jogo {
    private String modalidadeJogo;
    private String dataJogo;
    private String horaJogo;
    private String time1;
    private String time2;


    public Jogo() {
    }

    public Jogo(String modalidadeJogo, String dataJogo, String horaJogo, String time1, String time2) {
        this.modalidadeJogo = modalidadeJogo;
        this.dataJogo = dataJogo;
        this.horaJogo = horaJogo;
        this.time1 = time1;
        this.time2 = time2;
    }

    public String getModalidadeJogo() {
        return modalidadeJogo;
    }

    public void setModalidadeJogo(String modalidadeJogo) {
        this.modalidadeJogo = modalidadeJogo;
    }

    public String getDataJogo() {
        return dataJogo;
    }

    public void setDataJogo(String dataJogo) {
        this.dataJogo = dataJogo;
    }

    public String getHoraJogo() {
        return horaJogo;
    }

    public void setHoraJogo(String horaJogo) {
        this.horaJogo = horaJogo;
    }

    public String getTime1() {
        return time1;
    }

    public void setTime1(String time1) {
        this.time1 = time1;
    }

    public String getTime2() {
        return time2;
    }

    public void setTime2(String time2) {
        this.time2 = time2;
    }
}
