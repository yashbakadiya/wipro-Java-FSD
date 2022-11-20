var CasioCalculator = /** @class */ (function () {
    function CasioCalculator() {
    }
    CasioCalculator.prototype.add = function (num1, num2) {
        var result = num1 + num2;
        return result;
    };
    return CasioCalculator;
}());
var calculator = new CasioCalculator();
var result = calculator.add(2, 5);
console.log("result=" + result);
