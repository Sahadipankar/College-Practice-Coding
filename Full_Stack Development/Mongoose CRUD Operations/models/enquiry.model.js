const e = require ("express");
let mongoose = require("mongoose");

let userEnquireSchema = mongoose.Schema({
    name: {
        type: String,
        required: true
    },
    email: {
        type: String,
        required: true,
        unique: true
    },
    phone: {
        type: String,
        required: true
    },
    message: {
        type: String,
        required: true
    }
});

let enquiryModel = mongoose.model('Enquiry', userEnquireSchema);

module.exports = enquiryModel;