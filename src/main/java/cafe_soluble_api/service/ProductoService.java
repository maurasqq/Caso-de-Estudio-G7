package cafe_soluble_api.service;

//public class ProductoService {
//}

import cafe_soluble_api.model.Producto;
import cafe_soluble_api.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService{

    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository= productoRepository;
    }

    // Consultar id existente, id inexistente,
    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    public Optional<Producto> findById(Long id) {
        return productoRepository.findById(id);
    }

    public Producto save(Producto student) {
        return productoRepository.save(student);
    }

    public Producto update(Long id, Producto student) {
        student.setId(id);
        return productoRepository.save(student);
    }

    public void deleteById(Long id) {
        productoRepository.deleteById(id);
    }
}
