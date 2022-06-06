$(function () {
$('.img-thumbnail').click(function (e) {
$('#image-modal img').attr({
'src': $(this).attr('src'),
'attr': $(this).attr('alt')
});
$("#image-modal").modal('show');
});
$('#image-modal img').on('click', function () {
$("#image-modal").modal('hide')
});
});

