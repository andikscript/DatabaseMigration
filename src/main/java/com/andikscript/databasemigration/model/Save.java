package com.andikscript.databasemigration.model;

import javax.persistence.*;

@Entity
@Table(name = "save")
public class Save {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nama", nullable = false, length = 512)
    private String nama;

    @Column(name = "keterangan", nullable = false, length = 1048)
    private String keterangan;

    @Column(name = "gaji", nullable = false)
    private Integer gaji;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public Integer getGaji() {
        return gaji;
    }

    public void setGaji(Integer gaji) {
        this.gaji = gaji;
    }
}