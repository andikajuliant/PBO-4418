package mvc.controller;

import mvc.DAO.DAOMahasiswa;
import mvc.DAOInterface.interfacemhs;
import mvc.model.mahasiswa;
import mvc.model.tabelmodelmahasiswa;
import mvc.view.formmhs;
import java.util.List;
import javax.swing.JOptionPane;


public class controllermahasiswa {
    FormMahasiswa frame;
    interfacemhs implMahasiswa;
    List<mahasiswa> lb;
    
    public controllermahasiswa(FormMahasiswa frame) {
        this.frame = frame;
        implMahasiswa = new DAOMahasiswa();
        lb = implMahasiswa.getAll();
    }
    
    // mengosongkan semua field
    public void reset() {
        frame.getTxtID().setText("");
        frame.getTxtNim().setText("");
        frame.getTxtNama().setText("");
        frame.getTxtJk().setSelectedItem("");
        frame.getTxtAlamat().setText("");
    }
    
    // menampilkan data ke dalam tabel
    public  void isiTable() {
        lb = implMahasiswa.getAll();
        tabelmodelmahasiswa tmb = new tabelmodelmahasiswa(lb);
        frame.getTabelData().setModel(tmb);
    }
    
    public void isiField(int row) {
        frame.getTxtID().setText(lb.get(row).getId().toString());
        frame.getTxtNim().setText(lb.get(row).getNim());
        frame.getTxtNama().setText(lb.get(row).getNama());
        frame.getTxtJk().setSelectedItem(lb.get(row).getJk());
        frame.getTxtAlamat().setText(lb.get(row).getAlamat());
    }
    
    public void insert() {
        if (!frame.getTxtNim().getText().trim().isEmpty()& !frame.getTxtNama().getText().trim().isEmpty()) {
            mahasiswa b = new mahasiswa();
            b.setNim(frame.getTxtNim().getText());
            b.setNama(frame.getTxtNama().getText());
            b.setJk(frame.getTxtJk().getSelectedItem().toString());
            b.setAlamat(frame.getTxtAlamat().getText());
            implMahasiswa.insert(b);
            JOptionPane.showMessageDialog(null, "Simpan Data Sukses");
        } else {
            JOptionPane.showMessageDialog(frame, "Data Tidak Boleh Kosong");
        }
    }
    
    public void update() {
        if (!frame.getTxtID().getText().trim().isEmpty()) {
            mahasiswa b = new mahasiswa();
            b.setNim(frame.getTxtNim().getText());
            b.setNama(frame.getTxtNama().getText());
            b.setJk(frame.getTxtJk().getSelectedItem().toString());
            b.setAlamat(frame.getTxtAlamat().getText());
            b.setId(Integer.parseInt(frame.getTxtID().getText()));
            implMahasiswa.update(b);
            JOptionPane.showMessageDialog(null, "Update Data Sukses");
        } else {
            JOptionPane.showMessageDialog(frame, "Pilih Data yang akan diubah");
        }
    }
    
    public void delete() {
        if (!frame.getTxtID().getText().trim().isEmpty()) {
            int id = Integer.parseInt(frame.getTxtID().getText());
            implMahasiswa.delete(id);
            JOptionPane.showMessageDialog(null, "Hapus Data Sukses");
        } else {
            JOptionPane.showMessageDialog(frame, "Pilih Data yang akan dihapus");
        }
    }
    
    public  void isiTableCariNama() {
        lb = implMahasiswa.getCariNama(frame.getTxtSearchName().getText());
        tabelmodelmahasiswa tmb = new tabelmodelmahasiswa(lb);
        frame.getTabelData().setModel(tmb);
    }
    
    public void carinama() {
        if (!frame.getTxtSearchName().getText().trim().isEmpty()) {
            implMahasiswa.getCariNama(frame.getTxtSearchName().getText());
            isiTableCariNama();
        } else {
            JOptionPane.showMessageDialog(frame, "Silahkan Pilih Data");
        }
    }
}