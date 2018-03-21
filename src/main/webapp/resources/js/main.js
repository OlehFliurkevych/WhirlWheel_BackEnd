$('.sl').slick({
    infinite: true,
    speed: 500,
    autoplay: true,
    autoplaySpeed: 3000,
    fade: true,
    dots: false,
    cssEase: 'linear'
});

$('.fliper-btn').click(function(){
    $('.flip').find('.card').toggleClass('flipped');

});

