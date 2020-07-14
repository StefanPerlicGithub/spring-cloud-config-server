package com.ftn.delete.controller;

import com.ftn.delete.repository.*;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteController {

    private final CustomerRepository customerRepository;
    private final EmployeeRepository employeeRepository;
    private final ManufacturerRepository manufacturerRepository;
    private final MethodOfPaymentRepository methodOfPaymentRepository;
    private final ProductRepository productRepository;
    private final ProductTypeRepository productTypeRepository;
    private final ReceiptRepository receiptRepository;
    private final SupplierRepository supplierRepository;

    public DeleteController(CustomerRepository customerRepository, EmployeeRepository employeeRepository, ManufacturerRepository manufacturerRepository, MethodOfPaymentRepository methodOfPaymentRepository, ProductRepository productRepository, ProductTypeRepository productTypeRepository, ReceiptRepository receiptRepository, SupplierRepository supplierRepository) {
        this.customerRepository = customerRepository;
        this.employeeRepository = employeeRepository;
        this.manufacturerRepository = manufacturerRepository;
        this.methodOfPaymentRepository = methodOfPaymentRepository;
        this.productRepository = productRepository;
        this.productTypeRepository = productTypeRepository;
        this.receiptRepository = receiptRepository;
        this.supplierRepository = supplierRepository;
    }

    @ApiOperation(value = "Deletes customer")
    @DeleteMapping("/customer/{id}")
    public void addNewCustomer(@ApiParam("Id") @PathVariable("id") Long id) {
        customerRepository.deleteById(id);
    }

    @ApiOperation(value = "Deletes employee")
    @DeleteMapping("/employee/{id}")
    public void addNewEmployee(@ApiParam("Id") @PathVariable("id") Long id) {
        employeeRepository.deleteById(id);
    }

    @ApiOperation(value = "Deletes manufacturer")
    @DeleteMapping("/manufacturer/{id}")
    public void addNewManufacturer(@ApiParam("Id") @PathVariable("id") Long id) {
        manufacturerRepository.deleteById(id);
    }

    @ApiOperation(value = "Deletes method of payment")
    @DeleteMapping("/methodOfPayment/{id}")
    public void deleteMethodOfPayment(@ApiParam("Id") @PathVariable("id") Long id) {
        methodOfPaymentRepository.deleteById(id);
    }

    @ApiOperation(value = "Deletes product")
    @DeleteMapping("/product/{id}")
    public void addNewProduct(@ApiParam("Id") @PathVariable("id") Long id) {
        productRepository.deleteById(id);
    }

    @ApiOperation(value = "Deletes product type")
    @DeleteMapping("/productType/{id}")
    public void deleteProductType(@ApiParam("Id") @PathVariable("id") Long id) {
        productTypeRepository.deleteById(id);
    }

    @ApiOperation(value = "Deletes supplier")
    @DeleteMapping("/supplier/{id}")
    public void deleteSupplier(@ApiParam("Id") @PathVariable("id") Long id) {
        supplierRepository.deleteById(id);
    }

    @ApiOperation(value = "Deletes receipt")
    @DeleteMapping("/receipt/{id}")
    public void deleteReceipt(@ApiParam("Id") @PathVariable("id") Long id) {
        receiptRepository.deleteById(id);
    }
}
