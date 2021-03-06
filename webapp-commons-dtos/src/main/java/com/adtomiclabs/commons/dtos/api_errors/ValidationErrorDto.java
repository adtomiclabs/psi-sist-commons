package com.adtomiclabs.commons.dtos.api_errors;

import com.adtomiclabs.commons.errors.ValidationError;

import java.util.List;

/**
 * Data transfer object for client errors caused when an entity is not valid (there are missing or illegal values).
 */
public final class ValidationErrorDto extends EntityErrorDto<ValidationError> {

    /**
     * Constructor.
     *
     * @param errors The {@link List} of {@link ValidationError}s.
     */
    public ValidationErrorDto(List<ValidationError> errors) {
        super(ErrorFamily.VALIDATION, errors);
    }
}
