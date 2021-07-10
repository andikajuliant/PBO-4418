package mvc.DAOInterface;

import java.util.List;
import mvc.Model.*;

public interface interfacemhs {
    public void insert(Mahasiswa b);
    public void update(Mahasiswa b);
    public void delete(int id);
    public List<Mahasiswa> getAll();
    public List<Mahasiswa> getCariNama(String nama);
}