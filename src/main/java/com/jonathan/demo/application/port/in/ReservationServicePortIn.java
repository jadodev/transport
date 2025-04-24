package com.jonathan.demo.application.port.in;

import com.jonathan.demo.application.dto.FactureDto;
import com.jonathan.demo.application.dto.ReservationDto;

public interface ReservationServicePortIn {
    FactureDto makeReservation(ReservationDto reservationDto);
}
