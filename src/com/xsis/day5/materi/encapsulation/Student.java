package com.xsis.day5.materi.encapsulation;

public class Student {
    private String nim;
    private String nama;
    private String jurusan;
    private double ipk;
    private String type;
    static int counter = 0;

    // cosntrutctor default
    public Student(){

    }

    public Student(String nim, String nama){
        this.nim = nim;
        this.nama = nama;
        counter++;
    }

    // parameterize constructor
    public Student(String nim, String nama, String jurusan, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.ipk = ipk;
        counter++;
    }


    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nim='" + nim + '\'' +
                ", nama='" + nama + '\'' +
                ", jurusan='" + jurusan + '\'' +
                ", ipk=" + ipk +
                ", type='" + type + '\'' +
                '}';
    }
}
