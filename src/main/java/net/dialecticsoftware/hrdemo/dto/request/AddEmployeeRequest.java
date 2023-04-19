package net.dialecticsoftware.hrdemo.dto.request;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import net.dialecticsoftware.hrdemo.enums.Department;
import net.dialecticsoftware.hrdemo.enums.Level;

/**
 * @author huseyinaydin
 */
public record AddEmployeeRequest(@NotBlank String firstname,

                                 @NotBlank String lastname,

                                 @NotNull LocalDateTime birthDate,

                                 @NotNull Department department,

                                 @NotNull BigDecimal salary,

                                 @NotNull LocalDateTime startDate,

                                 Double performance,

                                 @NotNull Level level) {

}
