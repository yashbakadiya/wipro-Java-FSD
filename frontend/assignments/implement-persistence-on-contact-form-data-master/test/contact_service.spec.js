const chai = require('chai');
const expect = chai.expect;
const contactService = require("../js/contact_service");
const jest= require('jest-mock');
var sinon = require("sinon");
var sinonChai = require("sinon-chai");
chai.use(sinonChai);

describe("Contact Form", function () {
    let open, send, setRequestHeader, onload, onerror;
    it("should have persistSubmittedContact function", function () {
        expect(typeof (contactService.persistSubmittedContact)).equal("function");
    });

    it("should have showSubmittedContact function", function () {
        expect(typeof (contactService.showPersistedData)).equal("function");
    });

    it("should make post request to save contacts data", () => {
        createXHRmock();
        let contact = {
            firstName: "mary",
            lastName: "mathews",
            email: "mary.mathews@gmail.com",
            homeNo: "+1 908 780 3424",
            contactAddedOn: new Date()
        }
        contactService.persistSubmittedContact(contact);
        console.log("*** open",open);
        expect(open.mock.calls[0][0]).equal('POST')
        expect(open.mock.calls[0][1]).equal('http://localhost:3000/contacts')
        expect(send.mock.calls[0][0]).equal(JSON.stringify(contact));
    });

    it("should make get request to contacts and fetch data", () => {
        createXHRmock();
        contactService.showPersistedData();
        expect(open.mock.calls[0][0]).equal('GET')
        expect(open.mock.calls[0][1]).equal('http://localhost:3000/contacts')
    });

    function createXHRmock() {
        open = jest.fn();

        send = jest.fn().mockImplementation(function (contact) {
            onload = this.onload.bind(this);
            onerror = this.onerror.bind(this);
        });

        setRequestHeader = jest.fn();
        
        const xhrMockClass = function () {
            return {
                open,
                send,
                setRequestHeader
            };
        };

        XMLHttpRequest = jest.fn().mockImplementation(xhrMockClass);
    }
});