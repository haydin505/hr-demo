package net.dialecticsoftware.hrdemo.dto.request;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import net.dialecticsoftware.hrdemo.enums.Department;
import net.dialecticsoftware.hrdemo.enums.Level;

/**
 * @author huseyinaydin
 */
public record UpdateEmployeeRequest(String firstname,

                                    String lastname,

                                    LocalDateTime birthDate,

                                    Department department,

                                    BigDecimal salary,

                                    LocalDateTime startDate,

                                    Double performance,

                                    Level level) {

}
