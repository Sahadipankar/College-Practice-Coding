//npm i express
//npm i mongoose
//npm i dotenv

let express = require('express');
let mongoose = require('mongoose');
let enquiryModel = require('./models/enquiry.model');
require('dotenv').config();

//Connect to MongoDB
let app = express();

app.use(express.json());


//Insert enquiry data
app.post('/api/enquiry-insert', (req, res) => {

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
})

// Get all enquiry list
app.get('/api/enquiry-list', async (req, res) => {
    let enquiryList = await enquiryModel.find();
    res.status(200).json({
        status: 1,
        message: "Enquiry list: ",
        data: enquiryList})
});


//Delete enquiry data
app.delete('/api/enquiry-delete/:id', async (req, res) => {
    let enquiryId = req.params.id;
    let deletedEnquiry = await enquiryModel.deleteOne({_id: enquiryId});
    res.send({
        status: 1,
        message: "Enquiry deleted successfully...",
        id: enquiryId,
        delRes: deletedEnquiry
    });
})



//Update enquiry data
app.put('/api/enquiry-update/:id', async (req, res) => {
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
})


mongoose.connect(process.env.DBURL).then(() => {
    console.log("Connected to MongoDB...");
    app.listen(process.env.PORT, () => {
        console.log("Server is running on port " + process.env.PORT);
    });
});