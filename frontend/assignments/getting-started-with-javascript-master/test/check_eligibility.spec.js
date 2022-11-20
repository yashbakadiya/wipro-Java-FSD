const chai = require('chai');
const expect = chai.expect;
const checkEligibility = require("../src/check_eligibility");

describe("Check Voting Age Eligibility", function () {

    it("should be a function", function () {
        const _checkEligibility = checkEligibility;
        expect(typeof(_checkEligibility)).equal("function");
         
    });
    it("should return true for the valid age", function () {
        const isEligible = checkEligibility(25);
        expect(isEligible).equal(true);
         
    });
    it("should return false for the invalid age", function () {
        const isEligible = checkEligibility(15);
        expect(isEligible).equal(false);
         
    });
    it("should return error message for the invalid input types provided", function () {
        const isEligible = checkEligibility([10,15]);
        expect(isEligible).equal("Invalid Age Input, Age Should Only Be Number !!");
    });
});
