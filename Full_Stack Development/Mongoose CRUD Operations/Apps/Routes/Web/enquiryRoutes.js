let express = require('express');
const { enquiryInsert, enquiryList, enquiryDelete, enquiryUpdate } = require('../../Controllers/Web/userEnquiryController');
let enquiryRoutes = express.Router();


//Insert enquiry data
enquiryRoutes.post('/enquiry-insert', enquiryInsert);



// Get all enquiry list
enquiryRoutes.get('/enquiry-list', enquiryList);


//Delete enquiry data
enquiryRoutes.delete('/enquiry-delete/:id', enquiryDelete);



//Update enquiry data
enquiryRoutes.put('/enquiry-update/:id', enquiryUpdate)

//Export enquiry routes
module.exports = {enquiryRoutes};