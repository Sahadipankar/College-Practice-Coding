const enquiryModel = require("../../Models/enquiry.model");


//  Insert enquiry data

let enquiryInsert = (req, res) => {

    let {sName, sEmail, sPhone, sMessage} = req.body;

    let enquiry = new enquiryModel ({
        name: sName,
        email: sEmail,
        phone: sPhone,
        message: sMessage
    });

    enquiry.save().then (() => {
        res.send({
            status: 1,
            message: "Data saved successfully..."
        });
    }).catch((err) => {
        res.send ({
            status: 0,
            message: "Error while saving enquiry...", error: err
        });
    })
}


// Get all enquiry list

let enquiryList = async (req, res) => {
    let enquiryList = await enquiryModel.find();
    res.status(200).json({
        status: 1,
        message: "Enquiry list: ",
        data: enquiryList})
}


// Delete enquiry data

let enquiryDelete = async (req, res) => {
    let enquiryId = req.params.id;
    let deletedEnquiry = await enquiryModel.deleteOne({_id: enquiryId});
    res.send({
        status: 1,
        message: "Enquiry deleted successfully...",
        id: enquiryId,
        delRes: deletedEnquiry
    });
}


// Update enquiry data

let enquiryUpdate = async (req, res) => {
    let enquiryId = req.params.id;
    let {sName, sEmail, sPhone, sMessage} = req.body;

    let updateObj = {
        name: sName,
        email: sEmail,
        phone: sPhone,
        message: sMessage
    };

    let updateRes = await enquiryModel.updateOne({_id: enquiryId}, updateObj);

    res.send({
        status: 1,
        message: "Enquiry updated successfully...",
        updateRes
    });
}

// Export all functions

module.exports = {enquiryInsert, enquiryList, enquiryDelete, enquiryUpdate};