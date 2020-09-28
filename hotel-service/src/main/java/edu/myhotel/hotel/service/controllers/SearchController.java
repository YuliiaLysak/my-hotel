package edu.myhotel.hotel.service.controllers;

import edu.myhotel.hotel.service.services.SearchResult;
import edu.myhotel.hotel.service.services.SearchService;
import edu.myhotel.hotel.service.services.RoomDetailInfo;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class SearchController {
    private final SearchService searchService;

    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    @GetMapping("/rooms")
    public SearchResult searchAvailableRoom(
            @RequestParam("checkIn") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate checkIn,
            @RequestParam("checkOut") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate checkOut) {

        return searchService.searchAvailableRoom(checkIn, checkOut);
    }

    @GetMapping("/rooms/{id}")
    public RoomDetailInfo getRoomDetailInfo(@PathVariable("id") int roomId) {
        return searchService.getRoomDetailInfo(roomId);
    }
}
