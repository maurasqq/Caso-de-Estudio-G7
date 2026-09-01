package cafe_soluble_api.service;

//public class ProductoService {
//}

import cafe_soluble_api.repository.ProductoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductoService{

    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository= productoRepository;
    }

    // Consultar id existente, id inexistente,
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }

    public Student save(Student student) {
        return studentRepository.save(student);
    }

    public Student update(Long id, Student student) {
        student.setId(id);
        return studentRepository.save(student);
    }

    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }
}
