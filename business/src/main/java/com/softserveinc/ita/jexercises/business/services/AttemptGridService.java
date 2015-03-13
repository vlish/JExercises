package com.softserveinc.ita.jexercises.business.services;

import com.softserveinc.ita.jexercises.common.dto.AttemptDto;
import com.softserveinc.ita.jexercises.common.dto.GridResponseDto;
import com.softserveinc.ita.jexercises.common.dto.SearchCondition;

/**
 * Services used for attempts DataTable.
 *
 * @author Taras Vuyiv
 */
public interface AttemptGridService {
    /**
     * Getting data for grid of attempts.
     *
     * @param userId User ID.
     * @param testId Test ID.
     * @param searchCondition Filter parameters.
     * @return Grid Response DTO with attempts info.
     */
    GridResponseDto<AttemptDto> getUserAttempts(
            Long userId, Long testId, SearchCondition searchCondition);
}
