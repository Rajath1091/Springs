package springs_hibernate_task.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import springs_hibernate_task.dto.Cart;
import springs_hibernate_task.dto.Item;

@Component
public class CartDao {

	@Autowired
	private EntityManager entityManager;

	public void saveCart(Cart cart) {
		entityManager.getTransaction().begin();
		entityManager.persist(cart);
		entityManager.getTransaction().commit();

		System.out.println("Cart Saved Successfully");
	}

	public void updateCart(int id, Cart cart) {
		Cart receivedCart = entityManager.find(Cart.class, id);
		if (receivedCart != null) {
			cart.setId(id);
			cart.setItems(receivedCart.getItems());

			entityManager.getTransaction().begin();
			entityManager.merge(cart);
			entityManager.getTransaction().commit();

			System.out.println("Cart Updated Successfully");
		} else {
			System.out.println("Cart doesn't exists");
		}
	}

	public void updateItem(int id, Item item) {
		Item receivedItem = entityManager.find(Item.class, id);
		if (receivedItem != null) {
			item.setId(id);

			entityManager.getTransaction().begin();
			entityManager.merge(item);
			entityManager.getTransaction().commit();

			System.out.println("Item Updated Successfully");
		} else {
			System.out.println("Item doesn't exists");
		}
	}

	public void deleteCart(int id) {
		Cart cart = entityManager.find(Cart.class, id);

		entityManager.getTransaction().begin();
		entityManager.remove(cart);
		entityManager.getTransaction().commit();
	}

	public void getCartById(int id) {
		Cart cart = entityManager.find(Cart.class, id);
		System.out.println(cart);
	}

	public void getAllCart() {
		Query query = entityManager.createQuery("SELECT c FROM Cart c");
		List<Cart> carts = query.getResultList();
		System.out.println(carts);
	}

}
