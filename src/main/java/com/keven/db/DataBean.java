package com.keven.db;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.keven.model.OrderEntry;

@Repository("dataBean")
public class DataBean {

	@PersistenceContext
	private EntityManager em;

	private int pageSizeSubscriber = 10000;

	@PostConstruct
	public void init() {

	}

	/** Insert the entity to save. */
	@Transactional
	public <T> void insert(T e) {
		em.persist(e);
	}

	/** Update the entity. */
	@Transactional
	public <T> T update(T e) {
		return em.merge(e);
	}

	@Transactional
	public <T> int update(Class<T> clazz, String key, String oldValue,
			String newValue) {
		int number = em
				.createQuery(
						"UPDATE " + clazz.getSimpleName() + "s SET s." + key
								+ "='" + newValue + "' WHERE s." + key + "='"
								+ oldValue + "'", clazz).executeUpdate();
		System.out.println("Update " + number + "records in '" + key + "' - "
				+ oldValue + " >>> " + newValue);
		return number;
	}

	/** Delete the entity. */
	@Transactional
	public <T> void delete(T e) {
		em.remove(e);
	}

	// -------- LMOrderEntry
	@Transactional
	public OrderEntry persistOrderEntry(String orderNumber, int quantity,
			boolean active, String note) {
		OrderEntry order = new OrderEntry(orderNumber, quantity, active, note);
		em.persist(order);
		return order;
	}

	@Transactional(readOnly = true)
	public List<OrderEntry> getAllOrderEntry() {
		List<OrderEntry> metaList = findAll(OrderEntry.class);
		return metaList;
	}

	@Transactional(readOnly = true)
	public OrderEntry getOrderEntryById(long id) {
		return em.find(OrderEntry.class, id);
	}

	// --

	private <T> List<T> findAll(Class<T> clazz) {
		List<T> results = em.createQuery(
				"SELECT s FROM " + clazz.getSimpleName() + " s", clazz)
				.getResultList();

		return results;
	}

	private <T> List<T> findAllBy(Class<T> clazz, String key, String value) {
		if (value == null)
			value = "";
		List<T> results = em.createQuery(
				"SELECT s FROM " + clazz.getSimpleName() + " s WHERE s." + key
						+ "='" + value + "'", clazz).getResultList();

		return results;
	}

	private <T> T findFirstBy(Class<T> clazz, String key, String value) {
		if (value == null)
			value = "";
		List<T> results = em.createQuery(
				"SELECT s FROM " + clazz.getSimpleName() + " s WHERE s." + key
						+ "='" + value + "'", clazz).getResultList();
		if (!results.isEmpty()) {
			return results.get(0);
		}

		return null;
	}
}
