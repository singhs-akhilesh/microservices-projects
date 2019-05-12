/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.4).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Body;
import io.swagger.model.Customer;
import java.util.List;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-22T13:23:54.373Z")

@Api(value = "customer", description = "the customer API")
public interface CustomerApi {

    @ApiOperation(value = "Register a new customer to the bank", nickname = "addCustomer", notes = "", response = Customer.class, tags={ "customer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Customer created", response = Customer.class),
        @ApiResponse(code = 400, message = "Invalid input") })
    @RequestMapping(value = "/customer",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Customer> addCustomer(@ApiParam(value = "Customer object that needs to be added to the bank" ,required=true )  @Valid @RequestBody Body body);


    @ApiOperation(value = "Creates list of customers with given input array", nickname = "createCustomersWithArrayInput", notes = "", tags={ "customer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    @RequestMapping(value = "/customer/createWithArray",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> createCustomersWithArrayInput(@ApiParam(value = "List of customer object" ,required=true )  @Valid @RequestBody List<Customer> body);


    @ApiOperation(value = "Creates list of customers with given input array", nickname = "createCustomersWithListInput", notes = "", tags={ "customer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    @RequestMapping(value = "/customer/createWithList",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> createCustomersWithListInput(@ApiParam(value = "List of customer object" ,required=true )  @Valid @RequestBody List<Customer> body);


    @ApiOperation(value = "Delete customer by Id", nickname = "deleteCustomer", notes = "This will permanently delete the customer.", tags={ "customer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 404, message = "Customer id not found") })
    @RequestMapping(value = "/customer/{customerId}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteCustomer(@ApiParam(value = "The customer id that needs to be deleted",required=true) @PathVariable("customerId") Integer customerId);


    @ApiOperation(value = "Get all customers", nickname = "findCustomers", notes = "Returns all customer from the system", response = Customer.class, responseContainer = "List", tags={ "customer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of customers", response = Customer.class, responseContainer = "List") })
    @RequestMapping(value = "/customer",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Customer>> findCustomers(@ApiParam(value = "Tags used to filter the result") @Valid @RequestParam(value = "tags", required = false) List<String> tags,@ApiParam(value = "maximum number of results to return") @Valid @RequestParam(value = "limit", required = false) Integer limit);


    @ApiOperation(value = "Finds customer by name", nickname = "findCustomersByName", notes = "Multiple name values can be provided with comma separated strings", response = Customer.class, responseContainer = "List", tags={ "customer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Customer.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid name value") })
    @RequestMapping(value = "/customer/findByName",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Customer>> findCustomersByName(@ApiParam(value = "Name values that need to be considered for filter") @Valid @RequestParam(value = "name", required = false) List<String> name);


    @ApiOperation(value = "Find customer by Id", nickname = "getCustomerById", notes = "Returns a single customer", response = Customer.class, tags={ "customer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Customer.class),
        @ApiResponse(code = 404, message = "Invalid customer id") })
    @RequestMapping(value = "/customer/{customerId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Customer> getCustomerById(@ApiParam(value = "ID of customer to return",required=true) @PathVariable("customerId") Long customerId);


    @ApiOperation(value = "Updated customer by Id", nickname = "updateCustomer", notes = "", tags={ "customer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation"),
        @ApiResponse(code = 404, message = "Customer id not found") })
    @RequestMapping(value = "/customer/{customerId}",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateCustomer(@ApiParam(value = "customer id that need to be updated",required=true) @PathVariable("customerId") Integer customerId,@ApiParam(value = "Updated customer object" ,required=true )  @Valid @RequestBody Customer body);

}