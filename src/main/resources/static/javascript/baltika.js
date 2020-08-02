$(function() {
	let decimal = $( '.js-decimal' );
	decimal.maskMoney();
	
	let plain = $('.js-plain');
	plain.maskMoney({ precision: 0 });
})