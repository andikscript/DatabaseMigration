package com.andikscript.databasemigration.model;

import com.andikscript.databasemigration.constraints.GajiValue;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
@Table(name = "save")
public class Save {
    @Id
    @GeneratedValue
    @Column(name = "id", length = 16)
    private UUID id;

    @NotBlank(message = "name is mandatory")
    @Column(name = "nama", nullable = false, length = 512)
    private String nama;

    @NotBlank(message = "keterangan is mandatory")
    @Column(name = "keterangan", nullable = false, length = 1048)
    private String keterangan;

    @NotNull(message = "gaji is mandatory")
    @Column(name = "gaji", nullable = false)
    @GajiValue(message = "gaji denied")
    private Integer gaji;

    public UUID getId() {
        return id;
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