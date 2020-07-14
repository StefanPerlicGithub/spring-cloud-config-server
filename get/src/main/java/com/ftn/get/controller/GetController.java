package com.ftn.get.controller;

import com.ftn.get.model.*;
import com.ftn.get.repository.*;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class GetController {

    private final CustomerRepository customerRepository;
    private final EmployeeRepository employeeRepository;
    private final ManufacturerRepository manufacturerRepository;
    private final MethodOfPaymentRepository methodOfPaymentRepository;
    private final ProductRepository productRepository;
    private final ProductTypeRepository productTypeRepository;
    private final ReceiptRepository receiptRepository;
    private final SupplierRepository supplierRepository;

    public GetController(CustomerRepository customerRepository, EmployeeRepository employeeRepository, ManufacturerRepository manufacturerRepository, MethodOfPaymentRepository methodOfPaymentRepository, ProductRepository productRepository, ProductTypeRepository productTypeRepository, ReceiptRepository receiptRepository, SupplierRepository supplierRepository) {
        this.customerRepository = customerRepository;
        this.employeeRepository = employeeRepository;
        this.manufacturerRepository = manufacturerRepository;
        this.methodOfPaymentRepository = methodOfPaymentRepository;
        this.productRepository = productRepository;
        this.productTypeRepository = productTypeRepository;
        this.receiptRepository = receiptRepository;
        this.supplierRepository = supplierRepository;
    }

    @ApiOperation(value = "returns all customers")
    @GetMapping("/customer")
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @ApiOperation(value = "return one customer")
    @GetMapping("/customer/{id}")
    public ResponseEntity<Customer> getOneCustomer(@ApiParam("id") @PathVariable("id") Long id) {
        Customer customer = customerRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NO_CONTENT));
        return ResponseEntity.ok(customer);
    }

    @ApiOperation(value = "return all employees")
    @GetMapping("/employee")
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @ApiOperation(value = "return one employee")
    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getOneEmployee(@ApiParam("id") @PathVariable("id") Long id) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NO_CONTENT));
        return ResponseEntity.ok(employee);
    }

    @ApiOperation(value = "return all manufacturers")
    @GetMapping("/manufacturer")
    public List<Manufacturer> getAllManufacturers() {
        return manufacturerRepository.findAll();
    }

    @ApiOperation(value = "return one manufacturer")
    @GetMapping("/manufacturer/{id}")
    public ResponseEntity<Manufacturer> getOneManufacturer(@ApiParam("id") @PathVariable("id") Long id) {
        Manufacturer manufacturer = manufacturerRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NO_CONTENT));
        return ResponseEntity.ok(manufacturer);
    }

    @ApiOperation(value = "return all methods of payment")
    @GetMapping("/methodOfPayment")
    public List<MethodOfPayment> getAllMethodsOfPayment() {
        return methodOfPaymentRepository.findAll();
    }

    @ApiOperation(value = "return one method of payment")
    @GetMapping("/methodOfPayment/{id}")
    public ResponseEntity<MethodOfPayment> getOneMethodOfPayment(@ApiParam("id") @PathVariable("id") Long id) {
        MethodOfPayment methodOfPayment = methodOfPaymentRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NO_CONTENT));
        return ResponseEntity.ok(methodOfPayment);
    }

    @ApiOperation(value = "return all products")
    @GetMapping("/product")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @ApiOperation(value = "return one product")
    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getOneProduct(@ApiParam("id") @PathVariable("id") Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NO_CONTENT));
        return ResponseEntity.ok(product);
    }

    @ApiOperation(value = "return all product types")
    @GetMapping("/productType")
    public List<ProductType> getAllProductTypes() {
        return productTypeRepository.findAll();
    }

    @ApiOperation(value = "return one product type")
    @GetMapping("/productType/{id}")
    public ResponseEntity<ProductType> getOneProductType(@ApiParam("id") @PathVariable("id") Long id) {
        ProductType productType = productTypeRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NO_CONTENT));
        return ResponseEntity.ok(productType);
    }

    @ApiOperation(value = "return all receipts")
    @GetMapping("/receipt")
    public List<Receipt> getAllReceipts() {
        return receiptRepository.findAll();
    }

    @ApiOperation(value = "return one product type")
    @GetMapping("/receipt/{id}")
    public ResponseEntity<Receipt> getOneReceipt(@ApiParam("id") @PathVariable("id") Long id) {
        Receipt receipt = receiptRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NO_CONTENT));
        return ResponseEntity.ok(receipt);
    }

    @ApiOperation(value = "return all suppliers")
    @GetMapping("/supplier")
    public List<Supplier> getAllSuppliers() {
        return supplierRepository.findAll();
    }

    @ApiOperation(value = "return one supplier")
    @GetMapping("/supplier/{id}")
    public ResponseEntity<Supplier> getOneSupplier(@ApiParam("id") @PathVariable("id") Long id) {
        Supplier supplier = supplierRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NO_CONTENT));
        return ResponseEntity.ok(supplier);
    }
}
