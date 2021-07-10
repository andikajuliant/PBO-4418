package mvc.DAOInterface;

import java.util.List;
import mvc.model.admin;

public interface Iadmin {
    public void insert(Admin u);
    public void update(Admin u);
    public void delete(String identitas);
    public List<Admin> getAll();
    public List<Admin> getCariNama(String nama);
}
