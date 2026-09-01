package cafe_soluble_api.repository;

import cafe_soluble_api.model.Producto;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class ProductoRepository {
    private final List<Producto> productos = new ArrayList<>();
    private final AtomicLong secuencia = new AtomicLong(8);

    public ProductoRepository() {
        productos.add(new Producto(1L, "Café Clásico", "50 g", "Instantáneo", true));
        productos.add(new Producto(2L, "Café Clásico", "100 g", "Instantáneo", true));
        productos.add(new Producto(3L, "Café Clásico", "200 g", "Instantáneo", true));
        productos.add(new Producto(4L, "Café Premium", "100 g", "Premium", true));
        productos.add(new Producto(5L, "Café Premium", "200 g", "Premium", false));
        productos.add(new Producto(6L, "Café Descafeinado", "50 g", "Descafeinado", true));
        productos.add(new Producto(7L, "Café Descafeinado", "100 g", "Descafeinado", true));
        productos.add(new Producto(8L, "Café Reserva", "200 g", "Especial", false));
    }

    public List<Producto> findAll() {
        return new ArrayList<>(productos);
    }

    public Optional<Producto> findById(Long id) {
        return productos.stream()
                .filter(producto -> producto.getId().equals(id))
                .findFirst();
    }

    public Producto save(Producto producto) {
        long nuevoId = secuencia.incrementAndGet();
        producto.setId(nuevoId);
        productos.add(producto);
        return producto;
    }
}
