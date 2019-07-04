package com.eksad.supermarket;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.eksad.supermarket.dao.BrandDAO;
import com.eksad.supermarket.dao.CashierDAO;
import com.eksad.supermarket.dao.CustomerDAO;
import com.eksad.supermarket.dao.PersonDAO;
import com.eksad.supermarket.dao.ProductDAO;
import com.eksad.supermarket.dao.ProductElectronicDAO;
import com.eksad.supermarket.dao.ProductGroceryDAO;
import com.eksad.supermarket.dao.TransactionDAO;

@SpringBootApplication
public class SupermarketApplication implements ApplicationRunner{

	public static void main(String[] args) {
		SpringApplication.run(SupermarketApplication.class, args);
		
		
	}
	@Autowired
	private BrandDAO brandDAO;
	
	@Autowired
	private ProductDAO productDAO;
	
	@Autowired
	private PersonDAO personDAO;
	
	@Autowired
	private TransactionDAO transactionDAO;
	
	@Autowired
	private CashierDAO cashierDAO;
	
	@Autowired
	private CustomerDAO customerDAO;
	
	@Autowired
	private ProductElectronicDAO productElectronicDAO;
	
	@Autowired
	private ProductGroceryDAO productGroceryDAO;
	
	@Transactional
	@Override
	public void run(ApplicationArguments args) throws Exception {
//		System.out.println("Cashier");
//		cashierDAO.findAll().forEach(System.out::println);
//		
//		System.out.println("Cashier");
//		cashierDAO.findAll().forEach(System.out::println);

//		System.out.println("Electronic");
//		productElectronicDAO.findAll().forEach(System.out::println);
//		
//		System.out.println("Grocery"); 
//		productGroceryDAO.findAll().forEach(System.out::println);
		
//		System.out.println(transactionDAO.findTotalItemTransactionById(1L));
		
		List<Object[]> totals = 
				transactionDAO.findTotalNominalPerTransaction();
		for (Object[] total : totals) 
		{
			System.out.println("Id "+ total[0]);
			System.out.println("total: " + total[1]);
		}
		
	// brandDAO.findAll().forEach(System.out::println);
	 
	 
		
//		Brand brand1 = new Brand();
//		brand1.setName("Brand Test #1");
//		brand1.setProductType("Test #1");
//		brandDAO.save(brand1);
//
//		String bikinError = null;
//		bikinError.toString();
//		
//		Brand brand2 = new Brand();
//		brand2.setName("Brand Test #2");
//		brand2.setProductType("Test #2");
//		brandDAO.save(brand2);
		
//		Brand brand = brandDAO.findByName("Nestle").stream()
//				.findFirst()
//				.orElse(null);
		/*Brand brand = brandDAO.findOneByName("Sosro");
		
		if (brand !=null) 
		{
			brand.setProductType("Food and Beverages");
			brandDAO.save(brand);
		}
		
		brandDAO.findAll().forEach(System.out::println);*/
		/*Transaction transaction = new Transaction();
		transaction.setDate(new Date());
		transaction.setRemark("Test Transaction");
		transaction.setDetails(new HashSet<TransactionDetail>());
		
		TransactionDetail detail1 = new TransactionDetail();
		detail1.setProduct(productDAO.findById(1L).get());
		detail1.setQuantity(3);
		detail1.setTransaction(transaction);
		transaction.getDetails().add(detail1);
		
		TransactionDetail detail2 = new TransactionDetail();
		detail2.setProduct(productDAO.findById(3L).get());
		detail2.setQuantity(5);
		detail2.setTransaction(transaction);
		transaction.getDetails().add(detail2);
		
		transactionDAO.save(transaction);
		Transaction transaction = transactionDAO.findById(2L).get();
		System.out.println("====DONEE GETTTTTT TRANS++++");
		transaction.getDetails().size();
		
		
		transactionDAO.findAll()
			.forEach(System.out::println);*/
		/*Person person = new Person();
		person.setName("Jane Herlambang");
		
		PersonAddress address = new PersonAddress();
		address.setAddress("Kebun Raya");
		address.setCity("Bogor");
		
		person.setAddress(address);
		address.setPerson(person);
		
		personDAO.save(person);
		
		
		personDAO.findAll()
				.forEach(System.out::println);
		Product product = new Product();
		product.setName("Cimory Susu Coklat");
		product.setPrice(new BigDecimal (15000));
		
		Brand brand =  brandDAO.findById(1L).get();
		product.setBrand(brand);
		
		productDAO.save(product);
		
		
		productDAO.findAll()
				.forEach(System.out::println);*/
	}

	

	
		
		
}
