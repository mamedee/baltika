var objetoBaltika = objetoBaltika || {};

objetoBaltika.onSidebarToggleRequest = function(event) {
  event.preventDefault();
  $(this).blur();

  $('.js-sidebar, .js-content').toggleClass('is-toggled');
};

objetoBaltika.onSearchModalShowRequest = function(event) {
  event.preventDefault();

  $('.js-search-modal').fadeIn('slow');
  $('body').addClass('objetoBaltika-no-scroll');
  
  $('.js-search-modal-input').val('').select();
  
};

objetoBaltika.onSearchModalCloseRequest = function(event) {
  event.preventDefault();

  $('.js-search-modal').hide();
  $('body').removeClass('objetoBaltika-no-scroll');
};

//objetoBaltika.onFormLoadingSubmit = function(event) {
  //event.preventDefault();

  //objetoBaltika.showLoadingComponent();

  //setTimeout(function() {
  //  objetoBaltika.hideLoadingComponent();
  //}, 2000);
//};

objetoBaltika.showLoadingComponent = function() {
  $('.js-loading-overlay').css('display', 'table').hide().fadeIn('slow');
};

objetoBaltika.hideLoadingComponent = function() {
  $('.js-loading-component').fadeOut('fast');
};

objetoBaltika.initStickyTableHeaders = function() {
  if ($(window).width() >= 992) { 
    var stickyRef = $('.js-sticky-reference');
    var stickyTable = $('.js-sticky-table');

    if (stickyRef && stickyTable) {
      stickyTable.stickyTableHeaders({fixedOffset: stickyRef});
    }
  }
};

objetoBaltika.onMenuGroupClick = function(event) {
  var subItems = $(this).parent().find('ul');

  if (subItems.length) {
    event.preventDefault();
    $(this).parent().toggleClass('is-expanded');
  }
};

objetoBaltika.initMenu = function() {
  $('.js-menu > ul > li > a').bind('click', objetoBaltika.onMenuGroupClick);
  $('.objetoBaltika-menu__item .is-active').parents('.objetoBaltika-menu__item').addClass('is-expanded is-active');
};

$(function() {
  if (objetoBaltika.init) {
    objetoBaltika.init();
  }

  objetoBaltika.initMenu();
  objetoBaltika.initStickyTableHeaders();
  
  // Enable Bootstrap tooltip
  $('.js-tooltip').tooltip();
  
  // Bind events
  $('.js-sidebar-toggle').bind('click', objetoBaltika.onSidebarToggleRequest);
  $('.js-search-modal-trigger-show').bind('click', objetoBaltika.onSearchModalShowRequest);
  $('.js-search-modal-close').bind('click', objetoBaltika.onSearchModalCloseRequest);
  //$('.js-form-loading').bind('submit', objetoBaltika.onFormLoadingSubmit);
});