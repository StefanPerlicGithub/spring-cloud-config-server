package com.ftn.put.controller;

import com.ftn.put.model.*;
import com.ftn.put.repository.*;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PutController {

    private final CustomerRepository customerRepository;
    private final EmployeeRepository employeeRepository;
    private final ManufacturerRepository manufacturerRepository;
    private final MethodOfPaymentRepository methodOfPaymentRepository;
    private final ProductRepository productRepository;
    private final ProductTypeRepository productTypeRepository;
    private final ReceiptRepository receiptRepository;
    private final SupplierRepository supplierRepository;

    public PutController(CustomerRepository customerRepository, EmployeeRepository employeeRepository, ManufacturerRepository manufacturerRepository, MethodOfPaymentRepository methodOfPaymentRepository, ProductRepository productRepository, ProductTypeRepository productTypeRepository, ReceiptRepository receiptRepository, SupplierRepository supplierRepository) {
        this.customerRepository = customerRepository;
        this.employeeRepository = employeeRepository;
        this.manufacturerRepository = manufacturerRepository;
        this.methodOfPaymentRepository = methodOfPaymentRepository;
        this.productRepository = productRepository;
        this.productTypeRepository = productTypeRepository;
        this.receiptRepository = receiptRepository;
        this.supplierRepository = supplierRepository;
    }

    @ApiOperation(value = "Updates customer")
    @PutMapping("/customer")
    public ResponseEntity<Customer> addNewCustomer(@ApiParam("Customer") @RequestBody Customer customer) {
        return ResponseEntity.ok(customerRepository.save(customer));
    }

    @ApiOperation(value = "Updates employee")
    @PutMapping("/employee")
    public Employee addNewEmployee(@ApiParam("Employee") @RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @ApiOperation(value = "Updates manufacturer")
    @PutMapping("/manufacturer")
    public Manufacturer addNewManufacturer(@ApiParam("Manufacturer") @RequestBody Manufacturer manufacturer) {
        return manufacturerRepository.save(manufacturer);
    }

    @ApiOperation(value = "Updates method of payment")
    @PutMapping("/methodOfPayment")
    public MethodOfPayment addNewMethodOfPayment(@ApiParam("Method of payment") @RequestBody MethodOfPayment methodOfPayment) {
        return methodOfPaymentRepository.save(methodOfPayment);
    }

    @ApiOperation(value = "Updates product")
    @PutMapping("/product")
    public Product addNewProduct(@ApiParam("Product") @RequestBody Product product) {
        return productRepository.save(product);
    }

    @ApiOperation(value = "Updates product type")
    @PutMapping("/productType")
    public ProductType addNewProductType(@ApiParam("Product type") @RequestBody ProductType productType) {
        return productTypeRepository.save(productType);
    }

    @ApiOperation(value = "Updates supplier")
    @PutMapping("/supplier")
    public Supplier addNewMethodOfPayment(@ApiParam("Supplier") @RequestBody Supplier supplier) {
        return supplierRepository.save(supplier);
    }
}
