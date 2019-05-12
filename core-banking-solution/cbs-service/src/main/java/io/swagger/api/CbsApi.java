/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.4).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Body;
import io.swagger.model.Body1;
import io.swagger.model.Body2;
import io.swagger.model.Transaction;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-22T12:04:48.784Z")

@Api(value = "cbs", description = "the cbs API")
public interface CbsApi {

    @ApiOperation(value = "Deposit money to your own account", nickname = "cbsDeposit", notes = "Provide valid account id and amount", response = Transaction.class, tags={ "cbs", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Successful operation", response = Transaction.class),
        @ApiResponse(code = 405, message = "Invalid input given") })
    @RequestMapping(value = "/cbs/deposit",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Transaction> cbsDeposit(@ApiParam(value = ""  )  @Valid @RequestBody Body body);


    @ApiOperation(value = "fund transfer to other account", nickname = "cbsTransfer", notes = "Provide valid from and to account id and amount", response = Transaction.class, tags={ "cbs", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Successful operation", response = Transaction.class),
        @ApiResponse(code = 405, message = "Invalid input given") })
    @RequestMapping(value = "/cbs/transfer",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Transaction> cbsTransfer(@ApiParam(value = ""  )  @Valid @RequestBody Body2 body);


    @ApiOperation(value = "Withdral money from your own account", nickname = "cbsWithdrawl", notes = "Provide valid account id and amount", response = Transaction.class, tags={ "cbs", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Successful operation", response = Transaction.class),
        @ApiResponse(code = 405, message = "Invalid input given") })
    @RequestMapping(value = "/cbs/withdrawl",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Transaction> cbsWithdrawl(@ApiParam(value = ""  )  @Valid @RequestBody Body1 body);


    @ApiOperation(value = "Get all transactions", nickname = "getStatementByAccountId", notes = "Return a list of transactions", response = Transaction.class, responseContainer = "List", tags={ "cbs", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of transactions", response = Transaction.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "Account id not found") })
    @RequestMapping(value = "/cbs/statement/{accountId}",
        produces = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<Transaction>> getStatementByAccountId(@ApiParam(value = "ID of account used for statment generation",required=true) @PathVariable("accountId") Long accountId);

}