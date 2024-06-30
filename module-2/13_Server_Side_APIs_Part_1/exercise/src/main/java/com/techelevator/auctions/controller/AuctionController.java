package com.techelevator.auctions.controller;

import com.techelevator.auctions.dao.AuctionDao;
import com.techelevator.auctions.dao.MemoryAuctionDao;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;

import javax.swing.undo.AbstractUndoableEdit;
import java.util.List;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

    private AuctionDao auctionDao;

    public AuctionController() {
        this.auctionDao = new MemoryAuctionDao();
    }


    @RequestMapping(method = RequestMethod.GET)
    public List<Auction> list(@RequestParam(value = "?title_like", defaultValue = "") String title_like, @RequestParam(value = "?currentBid_lte=", defaultValue = "0") double currentBid_lte){

        if (!title_like.equals("")) {
            return auctionDao.getAuctionsByTitle(title_like);
        }
        if (currentBid_lte >= 0) {
            return auctionDao.getAuctionsByMaxBid(currentBid_lte);
        }




        return auctionDao.getAuctions();
    }


    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Auction get(@PathVariable int id) {
        return auctionDao.getAuctionById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Auction addAuction(@RequestBody Auction auction) {
        return auctionDao.createAuction(auction);
    }
}
