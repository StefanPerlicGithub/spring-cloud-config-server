package com.ftn.post.controller;

import com.ftn.post.model.*;
import com.ftn.post.repository.*;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    private final CustomerRepository customerRepository;
    private final EmployeeRepository employeeRepository;
    private final ManufacturerRepository manufacturerRepository;
    private final MethodOfPaymentRepository methodOfPaymentRepository;
    private final ProductRepository productRepository;
    private final ProductTypeRepository productTypeRepository;
    private final ReceiptRepository receiptRepository;
    private final SupplierRepository supplierRepository;

    public PostController(CustomerRepository customerRepository, EmployeeRepository employeeRepository, ManufacturerRepository manufacturerRepository, MethodOfPaymentRepository methodOfPaymentRepository, ProductRepository productRepository, ProductTypeRepository productTypeRepository, ReceiptRepository receiptRepository, SupplierRepository supplierRepository) {
        this.customerRepository = customerRepository;
        this.employeeRepository = employeeRepository;
        this.manufacturerRepository = manufacturerRepository;
        this.methodOfPaymentRepository = methodOfPaymentRepository;
        this.productRepository = productRepository;
        this.productTypeRepository = productTypeRepository;
        this.receiptRepository = receiptRepository;
        this.supplierRepository = supplierRepository;
    }

    @ApiOperation(value = "add new customer")
    @PostMapping("/customer")
    public ResponseEntity<Customer> addNewCustomer(@ApiParam("New customer") @RequestBody Customer customer) {
        return ResponseEntity.ok(customerRepository.save(customer));
    }

    @ApiOperation(value = "add new employee")
    @PostMapping("/employee")
    public Employee addNewEmployee(@ApiParam("New employee") @RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @ApiOperation(value = "add new manufacturer")
    @PostMapping("/manufacturer")
    public Manufacturer addNewManufacturer(@ApiParam("New manufacturer") @RequestBody Manufacturer manufacturer) {
        return manufacturerRepository.save(manufacturer);
    }

    @ApiOperation(value = "add new method of payment")
    @PostMapping("/methodOfPayment")
    public MethodOfPayment addNewMethodOfPayment(@ApiParam("New method of payment") @RequestBody MethodOfPayment methodOfPayment) {
        return methodOfPaymentRepository.save(methodOfPayment);
    }

    @ApiOperation(value = "add new product")
    @PostMapping("/product")
    public Product addNewProduct(@ApiParam("New product") @RequestBody Product product) {
        return productRepository.save(product);
    }

    @ApiOperation(value = "add new product type")
    @PostMapping("/productType")
    public ProductType addNewProductType(@ApiParam("New product type") @RequestBody ProductType productType) {
        return productTypeRepository.save(productType);
    }

    @ApiOperation(value = "add new receipt")
    @PostMapping("/receipt")
    public Receipt addNewReceipt(@ApiParam("New receipt") @RequestBody Receipt receipt) {
        return receiptRepository.save(receipt);
    }

    @ApiOperation(value = "add new supplier")
    @PostMapping("/supplier")
    public Supplier addNewMethodOfPayment(@ApiParam("New supplier") @RequestBody Supplier supplier) {
        return supplierRepository.save(supplier);
    }
}
