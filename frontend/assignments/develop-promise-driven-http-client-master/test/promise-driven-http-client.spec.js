const chai = require('chai');
const expect = chai.expect;
const http = require("../js/script");
const jsdom = require('mocha-jsdom');
const jest= require('jest-mock');
var sinonChai = require("sinon-chai");
chai.use(sinonChai);

describe("HTTP Client", function () {
    let open, send, setRequestHeader, onload, onerror;
    jsdom({url: "http://localhost"});
    it("should have get property to fetch data from server", function () {
        expect(new http().get).to;  
    });
 
    it("should have post property to send data to server", function () {
        expect(new http().post).to;  
    });
    it("should make get request to contacts and fetch data", () => {
        createXHRmock();
        http();
        console.log(send.mock);
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